//package net.engineeringdigest.journalApp.service;
//
//import net.engineeringdigest.journalApp.entity.User;
//import net.engineeringdigest.journalApp.repository.UserRepository;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.mockito.junit.jupiter.MockitoExtension;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import java.util.ArrayList;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.Mockito.*;
//
//@ExtendWith(MockitoExtension.class)
//public class UserDetailsServiceImplTests {
//
//    @Mock
//    private UserRepository userRepository;
//
//    @InjectMocks
//    private UserDetailsServiceImpl userDetailsService;
//
//    @BeforeEach
//    void setUp(){
//        MockitoAnnotations.initMocks(this);
//    }
//
//    @Test
//    void loadByUsernameTest() {
//        // Arrange
//        when(userRepository.findByUserName(anyString()))
//                .thenReturn(User.builder().userName("ram").password("encrypted").roles(new ArrayList<>()).build());
//
//        // Act
//        UserDetails user = userDetailsService.loadUserByUsername("ram");
//
//        // Assert
//        assertNotNull(user);
//        assertEquals("ram", user.getUsername());
//    }
//}
