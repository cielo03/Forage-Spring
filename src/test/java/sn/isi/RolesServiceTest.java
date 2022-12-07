package sn.isi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import sn.isi.dto.Roles;
import sn.isi.service.RolesServices;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class RolesServiceTest {

    @Autowired
    private RolesServices rolesService;

    @Test
    void getRoles() {
        List<Roles> roleList =
                rolesService.getRoles();

        Assertions.assertEquals(1, roleList.size());
    }

    @Test
    void getRole() {
        Roles role = rolesService.getRoles(1);

        Assertions.assertNotNull(role);
    }

    @Test
    void createRoles() {

        Roles role = new Roles();
        role.setLibelle("ROLE_CLIENT");

        Roles roleSave = rolesService.createRoles(role);

        Assertions.assertNotNull(roleSave);
        //Assertions.assertEquals(appRoles.getNom(), appRolesSave.getNom());
    }

    @Test
    void updateRole() {
        Roles role = new Roles();
        role.setLibelle("ROLE_TECH");

        Roles roleSave = rolesService.updateRoles(3, role);

        Assertions.assertEquals("ROLE_TECH", roleSave.getLibelle());

    }

    @Test
    void deleteRole() {

        rolesService.deleteRoles(3);
        Assertions.assertTrue(true);
    }

    @Test
    void operation() {
        int val1 = 1;
        int val2 = 2;
        int val3 = val1 + val2;
        Assertions.assertEquals(3, val3);
    }
}