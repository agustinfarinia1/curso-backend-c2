package com.farinia.desafioObserver.services;

import com.farinia.desafioObserver.utils.ConfigType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ConfigService {

    @Autowired
    ConfigSubject configSubject;

    @Value(value = "${user.test.rol}")
    private String userRol;
    @Value(value = "${user.test.email}")
    private String userEmail;
    @Value(value = "${user.test.phone}")
    private String userPhone;

    public void updateUserConfig(String userRolParam,String userEmailParam,String userPhoneParam) {
        userRol = userRolParam;
        userEmail = userEmailParam;
        userPhone = userPhoneParam;
        configSubject.notifyObservers(ConfigType.USER);//Se aplica el patron
    }

    public String getUserRol() {
        return userRol;
    }

    public void setUserRol(String userRol) {
        this.userRol = userRol;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    @Override
    public String toString() {
        return "{userRol='" + userRol + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userPhone='" + userPhone + '\'' +
                '}';
    }
}
