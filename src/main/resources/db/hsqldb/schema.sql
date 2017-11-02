-- Copyright 2016-2017 DiffBlue limited. All rights reserved.
DROP TABLE products IF EXISTS;

-- Create table to hold information about the products
CREATE TABLE products (
    id      INTEGER IDENTITY PRIMARY KEY,
    name    VARCHAR(30),
    price   DECIMAL(20,2),
    description VARCHAR(30)
);

