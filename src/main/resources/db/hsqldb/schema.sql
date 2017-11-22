-- Copyright 2016-2017 DiffBlue limited. All rights reserved.

DROP TABLE categories IF EXISTS;

-- Create table to hold information about product categories
CREATE TABLE categories (
  id      INTEGER IDENTITY PRIMARY KEY,
  name    VARCHAR(30) NOT NULL UNIQUE,
);

DROP TABLE collections IF EXISTS;

-- Create table to hold information about product categories
CREATE TABLE collections (
  id      INTEGER IDENTITY PRIMARY KEY,
  name    VARCHAR(30) NOT NULL UNIQUE,
);

DROP TABLE collections IF EXISTS;

-- Create table to hold information about product categories
CREATE TABLE collections (
    id      INTEGER IDENTITY PRIMARY KEY,
    name    VARCHAR(30) NOT NULL UNIQUE,
);

DROP TABLE products IF EXISTS;

-- Create table to hold information about the products
CREATE TABLE products (
  id              INTEGER IDENTITY PRIMARY KEY,
  sku             VARCHAR(30) NOT NULL UNIQUE,
  category_id     INTEGER NOT NULL,
  collection_id   INTEGER NOT NULL,
  name            VARCHAR(30),
  price           DECIMAL(20,2),
  description     VARCHAR(500),
  photo           VARCHAR(500),
  FOREIGN KEY (category_id)   REFERENCES categories(id),
  FOREIGN KEY (collection_id) REFERENCES collections(id)
);

DROP TABLE addresses IF EXISTS;

-- Create table to hold information about complete orders
CREATE TABLE addresses (
  id          INTEGER IDENTITY PRIMARY KEY,
  company     VARCHAR(30),
  address     VARCHAR(100),
  city        VARCHAR(30),
  country     VARCHAR(30),
  postcode    VARCHAR(30)
);

DROP TABLE orders IF EXISTS;

-- Create table to hold information about complete orders
CREATE TABLE orders (
  id          INTEGER IDENTITY PRIMARY KEY,
  order_ref   VARCHAR(60) NOT NULL UNIQUE,
  first_name  VARCHAR(30) NOT NULL,
  last_name   VARCHAR(30) NOT NULL,
  email       VARCHAR(30) NOT NULL,
  phone       VARCHAR(30) NOT NULL,
  shipping_address_id INTEGER NOT NULL,
  FOREIGN KEY (shipping_address_id)   REFERENCES addresses(id)
);

DROP TABLE order_items IF EXISTS;

-- Create table to hold information about the products
CREATE TABLE order_items (
  id          INTEGER IDENTITY PRIMARY KEY,
  order_id    INTEGER NOT NULL,
  product_id  INTEGER NOT NULL,
  quantity    INTEGER NOT NULL,
  FOREIGN KEY (order_id)   REFERENCES orders(id),
  FOREIGN KEY (product_id) REFERENCES products(id)
);
