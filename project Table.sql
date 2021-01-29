/*Create data Base */

create database project
use project

/*Create table Product*/

create table product
(
prod_id bigint  primary key identity(1,1),
prod_name varchar(40),
prod_detailes varchar(40),
prod_launch_date date,
prod_end_date date
)

drop table product

insert into product (prod_name,prod_detailes,prod_launch_date,prod_end_date) values
('sansumg','fast charge ','2001-01-01','2010-01-01')

drop table product

select * from product


/*Create table Policy*/


create table policy(
	policy_no bigint ,
	cust_id bigint primary key identity(001,1),
	cust_name varchar(40),
	insured_name varchar(40),
	dob varchar(40),
	email_add varchar(40),
	mobile_no bigint unique,
	premium_mode varchar(40) check(premium_mode in ('monthly','half yearly','yearly')), 
	policy_status varchar(10) check(policy_status in ('active','inactive')),
	customer_pan_no varchar(10) unique,
	policy_issuance_date date,
	contact_number_last_updated bigint unique,
	email_address_last_updated varchar(40) unique,
	bank_account_no bigint unique,
	whatsapp_opt_in_status bigint ,
	product_name varchar(40),
	prod_id bigint references product(prod_id),
	reinvest_applicable int check(reinvest_applicable in (1,0)) default 0,
	outstanding_payout money ,
	unclaimed_amount money,
	neft_registered int check(neft_registered in(1,0)) default 0,
	last_premium_paid char(1) check(last_premium_paid in('y','n')) default 'n')

insert into policy (dob) values('5432');

delete from policy where cust_id=34

select * from policy where email_add='sams020298@gmail.com';

insert into policy values(
124567,'Shubhams','Sharmas','1991-02-02','shubhams020298@gmail.com',8170643033,'yearly','active',16254228,'2001-01-01',
99196,'surajs@gmail.com',68672010,111,'sansung',1,1,10001,20001,1,'y')

select * from policy

update policy set email_add='suraj@gmai.com' where cust_id=32


delete from policy where cust_id=12


/*Create table Whatsapp Optin Table*/

create table whatsaap_opt
(
 optin_id bigint identity(100,1),
 mobile_no bigint unique references policy(mobile_no),
 policy_no bigint unique,
 optin_date date
)


/*Create table Temp User table */

create table temp_user
(
	mobile_no bigint unique references whatsaap_opt(mobile_no),
	otp int unique ,
	expire_time time,
	create_time time 
)


/* create table Updata data*/

create table update_data
(
	contact_number_last_updated bigint unique,
	email_address_last_updated varchar(40) unique,
)


