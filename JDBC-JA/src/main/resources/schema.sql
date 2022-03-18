    create table person
    (
       id integer not null,
       name varchar(255) not null,
       location varchar(255),
       birth_date timestamp,
       primary key(id)
    );

    INSERT INTO PERSON (ID, NAME, LOCATION,BIRTH_DATE)
    VALUES(10001,'Seweryn', 'Leszczyniec', sysdate());
    INSERT INTO PERSON (ID, NAME, LOCATION,BIRTH_DATE)
    VALUES(10002,'Joseph', 'Rome', sysdate());
    INSERT INTO PERSON (ID, NAME, LOCATION,BIRTH_DATE)
    VALUES(10003,'Tadeusz', 'Washington', sysdate());
    INSERT INTO PERSON (ID, NAME, LOCATION,BIRTH_DATE)
    VALUES(10004,'Roman', 'Praga', sysdate());
    INSERT INTO PERSON (ID, NAME, LOCATION,BIRTH_DATE)
    VALUES(10005,'Thomas', 'Vancouver', sysdate());