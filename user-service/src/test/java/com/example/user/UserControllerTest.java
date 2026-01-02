
package com.example.user;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class UserControllerTest {
    @Test
    void testMock() {
        UserController controller = mock(UserController.class);
        when(controller.users()).thenReturn("ok");
    }
}
