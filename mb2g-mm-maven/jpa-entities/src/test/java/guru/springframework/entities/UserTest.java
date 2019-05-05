package guru.springframework.entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Unit test for simple App.
 */

public class UserTest {

    @Test
    public void testGenerateUser() {
        // given
        User ash = User.builder().firstName("Ash").lastName("Barrett").email("ash@techleisure.com").build();
        User bob = User.builder().build();        

        // then
        assertNotNull(ash);
        assertEquals(ash.getFirstName(), "Ash");
        assertEquals(ash.getLastName(), "Barrett");
        assertEquals(ash.getEmail(), "ash@techleisure.com");
        assertEquals(ash.toString(), "User(id=null, firstName=Ash, lastName=Barrett, email=ash@techleisure.com)");
        assert(!ash.equals(bob));
        
    }

    @Test
    public void testModifyUserProperties(){
        // given
        User ash = User.builder().id(1L).firstName("Ash").lastName("Barrett").email("ash@techleisure.com").build();

        //when
        ash.setFirstName("Bob");
        ash.setLastName("Sagat");
        ash.setEmail("bob@test.com");
        ash.setId(2L);

        //then
        assertEquals(ash.getId(), Long.valueOf(2));
        assertEquals(ash.getFirstName(), "Bob");
        assertEquals(ash.getLastName(), "Sagat");
        assertEquals(ash.getEmail(), "bob@test.com");
    }

    @Test
    public void testUserBuilderToString(){
        String userString = User.builder().firstName("Ash").lastName("Barrett").email("ash@techleisure.com").toString();

        assertNotNull(userString);
    }
}
