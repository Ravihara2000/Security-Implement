package com.telusko.SpringSecurityEx.service;

import org.springframework.stereotype.Service;

@Service
public class JWTService {
    public String generateToken() {
        return "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IlJhdmkiLCJpYXQiOjE1MTYyMzkwMjJ9.0Fp48J-rEb21rAbdYzH15-1zadfuAM8bjJjbc-zicUs";
    }
}
