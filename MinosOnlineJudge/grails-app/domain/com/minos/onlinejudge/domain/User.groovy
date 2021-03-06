package com.minos.onlinejudge.domain

class User {
  
  static final ROLE_USER  = "user"
  static final ROLE_ADMIN = "admin"
  
  String username
  String dbUsername
	String password
  String email
  String role
  String institution
  
  public User() {
    
    username = ""
    dbUsername = ""
    password = ""
    email = ""
    role = ROLE_USER
    institution = ""
  }
  
  static hasMany = [clarifications: Clarification]

  static constraints = {
    dbUsername(blank: false, unique: true, matches: /[A-Za-z_0-9]*/)
		password(blank: false)
    email(blank: false, email: true, unique: true)
    role(inList:[ROLE_ADMIN,ROLE_USER])
    institution(nullable: true)
    institution(blank: false)
  }
}