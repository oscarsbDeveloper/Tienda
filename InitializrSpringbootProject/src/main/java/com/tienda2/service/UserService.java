
package com.tienda2.service;
//

import com.tienda2.entity.Persona;
import static org.apache.tomcat.jni.User.username;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService{
    
    @Autowired
    public IPersonaService personaService; 

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       Persona persona = this.personaService.findByNombre(username); 
       Userprincipal userPrincipal = new Userprincipal (persona); 
       return userPrincipal; 
    }
    
}
