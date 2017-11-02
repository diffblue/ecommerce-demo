-- Copyright 2016-2017 DiffBlue limited. All rights reserved.

DROP TABLE categories IF EXISTS;

-- Create table to hold information about product categories
CREATE TABLE categories (
    id      INTEGER IDENTITY PRIMARY KEY,
    name    VARCHAR(30) NOT NULL UNIQUE,
);

DROP TABLE products IF EXISTS;

-- Create table to hold information about the products
CREATE TABLE products (
    id      INTEGER IDENTITY PRIMARY KEY,
    category_id INTEGER NOT NULL,
    sku     VARCHAR(30) NOT NULL UNIQUE,
    name    VARCHAR(30) NOT NULL,
    price   DECIMAL(20,2) NOT NULL,
    description VARCHAR(30) NOT NULL
    FOREIGN KEY (category_id) REFERENCES categories(id)
);
