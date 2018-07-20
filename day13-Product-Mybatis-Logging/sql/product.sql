-- 1. PRODUCT 테이블 생성 구문
CREATE TABLE PRODUCT (
      prodCode    VARCHAR2(4)
    , prodName    VARCHAR2(50)
    , price       NUMBER(12)
    , quantity    NUMBER(3)
    , regdate     DATE  DEFAULT sysdate
    , moddate     DATE
    , CONSTRAINT  pk_product PRIMARY KEY (prodCode)
);

-- 2. isExist() : 동일 데이터가 존재하는지 선조회
SELECT p.PRODCODE
  FROM product p
 WHERE p.PRODCODE = ?
;

-- 3. add() : 신규 제품 정보 등록
INSERT INTO PRODUCT(PRODCODE, PRODNAME, price, quantity)
VALUES (?, ?, ?, ?)
;

-- 4. get() : 제품 정보 조회
SELECT p.PRODCODE
     , p.PRODNAME
     , p.PRICE
     , p.QUANTITY
  FROM product p
 WHERE p.PRODCODE = ?
;

-- 5. set()
UPDATE product p
   SET p.PRODCODE = ?
     , p.PRODNAME = ?
     , p.PRICE = ?
     , p.QUANTITY = ?
     , p.MODDATE = sysdate
 WHERE p.PRODCODE = ?
;

-- 6. remove()
DELETE product p
 WHERE p.PRODNAME = ?
;

-- 7. getAllProducts()
SELECT p.PRODCODE
     , p.PRODNAME
     , p.PRICE
     , p.QUANTITY
  FROM product p
;