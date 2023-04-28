create database atm;
show databases;
use atm;
create table signup(name varchar(20), father_name varchar(20), formno varchar(20), gender varchar(20), dob varchar(20), email varchar(20), marital varchar(20), address varchar(20), city varchar(20), pin varchar(20), state varchar(20));

select * from signup;
create table signuptwo(formno varchar(20), religion varchar(20), category varchar(20), income varchar(20), education varchar(20), occupation varchar(20), pan varchar(20), aadhar varchar(20), seniorcitizen varchar(20), existingaccount varchar(20));

create table signup3(formno varchar(20), accounttype varchar(40), cardnumber varchar(25), pin varchar(20), facility varchar(100));
create table Transaction(deposit varchar(20), withdrawl varchar(20),back varchar(20), ministatement varchar(20), deposit varchar(20));
create table bank(pin varchar(20), date varchar(20), type varchar(20),amount varchar(20));