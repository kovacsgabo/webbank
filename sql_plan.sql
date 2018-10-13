CREATE table account
(
account_id int primary key,
user_id int foreign key;
current_balance money,
details varchar,
account_type char foreign key
);

CREATE table account_type
(
account_type_id char primary key;
details varchar;
);

CREATE table transaction 
(
transaction_id int primary key,
account_id int foreign key,
transaction_date datetime not null Default getdate(), 
transaction_type_code varchar Not Null foreign key,
transaction_amount money Default '0',
details varcharchar, 
);

CREATE table transaction_type_code
(
transaction_type_code char primary key,
deposit_withdraw char
);

CREATE table user_id
(
user_id int primary key,
first_name varchar,
last_name varchar,
email varchar,
username varchar,
password varchar
);