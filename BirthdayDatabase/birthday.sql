--this should drop the table to make room to create new table
DROP TABLE IF EXISTS birthdays;

--creating table
CREATE TABLE birthdays (
    user_id serial,
    birth_day DATE NOT NULL,
    name VARCHAR(225) NOT NULL,
    address varchar(225) NOT NULL
);

--adding initial information to table
INSERT INTO birthdays (user_id, birth_day, name, address)
VALUES (1, '1967-03-15', 'OGD', '430 N Scottsdale Rd, Suite A112, Tempe, Arizona 85281'),
        (2, '1969-04-04', 'OGM', '430 N Scottsdale Rd, Suite A112, Tempe, Arizona 85281'),
        (3, '1998-10-11', 'Tiana', '430 N Scottsdale Rd, Suite A112, Tempe, Arizona 85281'),
        (4, '1990-12-21', '2GD', '717 Lancaster Dr NE, Salem, Oregon 97301'),
        (5, '1992-6-3', '2GN', '717 Lancaster Dr NE, Salem, Oregon 97301'),
        (6, '2016-7-13', 'Velociraptor', '717 Lancaster Dr NE, Salem, Oregon 97301'),
        (7, '2018-11-20', 'T-rex', '717 Lancaster Dr NE, Salem, Oregon 97301'),
        (8, '1994-12-14', 'AF', '160 W 2nd S, Suite 102, Rexburg, Idaho 83440'),
        (9, '1996-09-17', 'hollister', '160 W 2nd S, Suite 102, Rexburg, Idaho 83440');

--adding primary key to user_id
ALTER TABLE birthdays
    ADD PRIMARY KEY (user_id);

--printing to the screen
SELECT user_id AS "Family Number",
        birth_day AS "Birthday",
        name,
        address
FROM birthdays;

--adding new information to the table
INSERT INTO birthdays (user_id, birth_day, name, address)
Values (10, '2013-11-01', 'Puppy', '430 N Scottsdale Rd, Suite A112, Tempe, Arizona 85281');

--added puppy and printed to the screen
SELECT user_id AS "Family Number",
        birth_day AS "Birthday",
        name,
        address
FROM birthdays;

--delete puppy from TABLE
DELETE FROM birthdays
WHERE user_id = 10;

--print new table onto screen with filtered date
SELECT user_id AS "Family Number",
        birth_day AS "Birthday",
        name,
        address
FROM birthdays
WHERE birth_day > '1998-10-11';