-- Copyright 2016-2018 DiffBlue limited. All rights reserved.

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

DROP TABLE products IF EXISTS;

-- Create table to hold information about the products
CREATE TABLE products (
    id      INTEGER IDENTITY PRIMARY KEY,
    sku     VARCHAR(30) NOT NULL UNIQUE,
    category_id INTEGER NOT NULL,
    collection_id INTEGER NOT NULL,
    name    VARCHAR(30),
    price   DECIMAL(20,2),
    description VARCHAR(500),
    photo VARCHAR(500),
    FOREIGN KEY (category_id) REFERENCES categories(id),
    FOREIGN KEY (collection_id) REFERENCES collections(id)
);
