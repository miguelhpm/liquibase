CREATE TABLE PERSONS(
    ID NUMBER GENERATED BY DEFAULT AS IDENTITY,
    FIRST_NAME VARCHAR2(50) NOT NULL,
    LAST_NAME VARCHAR2(50) NOT NULL,
    PRIMARY KEY(ID)
);