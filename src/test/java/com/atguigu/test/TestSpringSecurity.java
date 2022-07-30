package com.atguigu.test;

import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class TestSpringSecurity{
    @Test
    public void testspringSecurity(){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String abc = encoder.encode("123");
        System.out.println("123 = " + abc);
        String abc2 = encoder.encode("123");
        System.out.println("123 = " + abc2);

        boolean matches = encoder.matches("123", "$2a$10$.nFPVFawA1pyygGZbys60uCoSf7DjF6TlCpfZIuAqHTJl1fbUSVS.");
        System.out.println("matches = " + matches);
    }
}
