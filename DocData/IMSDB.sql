CREATE DATABASE IMSDB

USE [IMSDB]
GO

-- (1) 員工資料表
CREATE TABLE [User] (
    [User_id]       nvarchar(50) NOT NULL PRIMARY KEY,
    [User_name]     nvarchar(50) NULL,
    [Gender]        char(1) NULL,
    [Birthday]      nvarchar(8) NULL,
    [Email]         nvarchar(120) NULL,
    [Cellphone]     nvarchar(15) NULL,
    [Address]       nvarchar(200) NULL,
    [Pwd]           nvarchar(70) NULL,
    [On_job_date]   nvarchar(8) NULL,
    [Off_job_date]  nvarchar(8) NULL,
    [Figure]        Varbinary(max) NULL,
    [Crt_time]      datetime NOT NULL,
    [Upd_time]      datetime NOT NULL
)

-- (2) 員工角色資料表
CREATE TABLE [User_role] (
    [User_role_id]   nvarchar(50) NOT NULL PRIMARY KEY,
    [User_id]        nvarchar(50) NULL,
    [Role_id]        nvarchar(50) NULL,
    [Crt_user_id]    nvarchar(50) NULL,
    [Crt_time]       datetime NOT NULL,
    [Upd_time]       datetime NOT NULL
)


-- (3) 角色資料表
CREATE TABLE [Role] (
    [Role_id]     nvarchar(50) NOT NULL PRIMARY KEY,
    [Role_name]   nvarchar(50) NULL,
    [Status]      varchar(2) NULL,
    [Crt_user_id] nvarchar(50) NULL,
    [Crt_time]    datetime NOT NULL,
    [Upd_time]    datetime NOT NULL
)



-- (4) 角色程序資料表
CREATE TABLE [Role_program] (
    [Role_program_id] nvarchar(50) NOT NULL PRIMARY KEY,
    [Role_id]         nvarchar(50) NULL,
    [Program_id]      nvarchar(50) NULL,
    [Crt_user_id]     nvarchar(50) NULL,
    [Crt_time]        datetime NOT NULL,
    [Upd_time]        datetime NOT NULL,
)

-- (5) 程序資料表
CREATE TABLE [Program] (
    [Program_id]    nvarchar(50) NOT NULL PRIMARY KEY,
    [Program_name]  nvarchar(50) NULL,
    [Status]        varchar(2) NULL,
    [Layer]         nvarchar(2) NULL,
    [Uri]           nvarchar(20) NULL,
    [Crt_time]      datetime NOT NULL,
    [Upd_time]      datetime NOT NULL
)


-- (6) 產品類別資料表
CREATE TABLE [Category] (
    [Category_id]    nvarchar(20) NOT NULL PRIMARY KEY,
    [Category_name]  nvarchar(20) NULL,
    [Category_desc]  nvarchar(200) NULL,
    [Crt_time]       datetime NOT NULL,
    [Upd_time]       datetime NOT NULL
)

-- (7) 產品資料表
CREATE TABLE [Product] (
    [Product_id]    nvarchar(20) NOT NULL PRIMARY KEY,
    [Product_name]  nvarchar(20) NULL,
    [Product_desc]  nvarchar(200) NULL,
    [Cost]          decimal(11,2) NULL,
    [Pre_status]    varchar(2) NULL,
    [Category_id]   nvarchar(20) NULL,
    [Supplier_id]   nvarchar(20) NULL,
    [Figure]        varbinary(max) NULL,
    [Crt_time]      datetime NOT NULL,
    [Upd_time]      datetime NOT NULL
)

-- (8) 產品現有庫存資料表
CREATE TABLE [Product_stock] (
    [Stock_id]    nvarchar(50) NOT NULL PRIMARY KEY,
    [Product_id]  nvarchar(50) NULL,
    [Price]       decimal(11,2) NULL,
    [Stock]       int NULL,
    [Crt_time]    datetime NOT NULL,
    [Upd_time]    datetime NOT NULL
)

-- (9) 產品預購庫存資料表
CREATE TABLE [Product_Pre_stock] (
    [Pre_stock_id] nvarchar(50) NOT NULL PRIMARY KEY,
    [Product_id]   nvarchar(50) NULL,
    [Pre_price]    decimal(11,2) NULL,
    [Pre_stock]    int NULL,
    [Crt_time]     datetime NOT NULL,
    [Upd_time]     datetime NOT NULL
)

-- (10) 客戶資料表
CREATE TABLE [Customer] (
    [Cust_id]        nvarchar(50) NOT NULL PRIMARY KEY,
    [Cust_name]      nvarchar(50) NULL,
    [Cust_tel]       nvarchar(15) NULL,
    [Cust_cellphone] nvarchar(15) NULL,
    [Cust_addr]      nvarchar(200) NULL,
    [Cust_email]     nvarchar(120) NULL,
    [Delivery_addr]  nvarchar(200) NULL,
    [Birthday]       nvarchar(8) NULL,
    [Crt_time]       datetime NOT NULL,
    [Upd_time]       datetime NOT NULL
)

-- (11) 訂單資料表
CREATE TABLE [Order] (
    [Order_id]        nvarchar(50) NOT NULL PRIMARY KEY,
    [Status]          varchar(2) NULL,
    [Cust_id]         nvarchar(50) NULL,
    [Order_name]      nvarchar(50) NULL,
    [Order_cellphone] nvarchar(15) NULL,
    [Order_addr]      nvarchar(200) NULL,
    [Order_count]     int NULL,
    [Order_all_price] decimal(11,2) NULL,
    [Order_discount]  decimal(11,2) NULL,
    [Order_date]      nvarchar(8) NULL,
    [Crt_time]        datetime NOT NULL,
    [Upd_time]        datetime NOT NULL
)

-- (12) 訂單明細資料表
CREATE TABLE [Order_detail] (
    [Order_detail_id]  nvarchar(50) NOT NULL PRIMARY KEY,
    [Order_id]         nvarchar(50) NOT NULL,
    [Product_id]       nvarchar(50) NULL,
    [Price]            decimal(11,2) NULL,
    [Product_count]    int NULL
)

-- (13) 進貨資料表
CREATE TABLE [Purchase] (
    [Pur_id]            nvarchar(50) NOT NULL PRIMARY KEY,
    [Pur_supplier_id]   nvarchar(50) NULL,
    [Pur_supplier_name] nvarchar(50) NULL,
    [Pur_supplier_tel]  nvarchar(15) NULL,
    [Pur_num]           nvarchar(50) NULL,
    [Pur_count]         int NULL,
    [Pur_all_price]     decimal(11,2) NULL,
    [Pur_date]          nvarchar(8) NULL,
    [Crt_time]          datetime NOT NULL,
    [Upd_time]          datetime NOT NULL 
)

-- (14) 進貨明細資料表
CREATE TABLE [Purchase_detail] (
    [Pur_detail_id] nvarchar(50) NOT NULL PRIMARY KEY,
    [Pur_id]        nvarchar(50) NOT NULL,
    [Product_id]    nvarchar(50) NULL,
    [Price]         decimal(11,2) NULL,
    [Product_count] int NULL
  
)

-- (15) 廠商資料表
CREATE TABLE [Supplier] (
    [Supplier_id]    nvarchar(50) NOT NULL PRIMARY KEY,
    [Supplier_name]  nvarchar(50) NULL,
    [Contact]        nvarchar(50) NULL,
    [Supp_tel]       nvarchar(15) NULL,
    [Supp_cellphone] nvarchar(15) NULL,
    [Supp_addr]      nvarchar(200) NULL,
    [Unify]          nvarchar(15) NULL,
    [Email]          nvarchar(120) NULL,
    [Figure]         varbinary(max) NULL,
    [Crt_time]       datetime NOT NULL,
    [Upd_time]       datetime NOT NULL,

)

-- (16) 預購訂單資料表
CREATE TABLE [Pre_order] (
    [Pre_order_id]   nvarchar(50) NOT NULL PRIMARY KEY,
    [Status]         varchar(2) NULL,
    [Cust_id]        nvarchar(50) NULL,
    [Pre_cust_name]  nvarchar(50) NULL,
    [Pre_cellphone]  nvarchar(15) NULL,
    [Pre_addr]       nvarchar(200) NULL,
    [Pre_count]      int NULL,
    [Pre_all_price]  decimal(11,2) NULL,
    [Pre_date]       nvarchar(8) NULL,
    [Crt_time]       datetime NOT NULL,
    [Upd_time]       datetime NOT NULL,
    
)

-- (17) 預購訂單明細資料表
CREATE TABLE [Pre_order_detail] (
    [Pre_order_detail_id] nvarchar(50) NOT NULL PRIMARY KEY,
    [Pre_order_id]        nvarchar(50) NOT NULL,
    [Product_id]          nvarchar(50) NULL,
    [Price]               decimal(11,2) NULL,
    [Product_count]       int NULL
)
