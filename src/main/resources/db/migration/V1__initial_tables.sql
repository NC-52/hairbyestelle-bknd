-- THIS FOLLOW PostgreSQL SYNTAX MAINLY

create table address (
    id bigserial primary key ,
    city varchar(255) not null ,
    country varchar(255),
    postal_code varchar(255),
    street varchar(255) not null
);

create table category (
    id bigserial primary key,
    name varchar(255) not null
);

create table client (
    id bigserial primary key,
    email varchar(255),
    first_name varchar(255) not null ,
    last_name varchar(255),
    phone varchar(255),
    address_id bigint,
    foreign key (address_id) references address
);

create table product (
    id bigserial primary key,
    created_at timestamp,
    deleted boolean,
    description varchar(255),
    image_url varchar(255) not null ,
    name varchar(255) not null ,
    price decimal(19,2) not null ,
    quantity integer not null,
    updated_at timestamp,
    category_id bigint,
    foreign key (category_id) references category
);

create table order_table (
    id bigserial primary key,
    delivery_date timestamp,
    order_date timestamp not null,
    status varchar(255) not null,
    client_id bigint,
    product_id bigint,
    foreign key (product_id) references product,
    foreign key (client_id) references client
);

create table other_service (
    id bigserial primary key,
    description varchar(255),
    due_to timestamp,
    name varchar(255) not null,
    price decimal(19,2) not null,
    status varchar(255),
    address_id bigint,
    foreign key (address_id) references address
);


