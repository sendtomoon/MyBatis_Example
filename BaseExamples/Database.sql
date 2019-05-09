-- Create table
create table Table1
(
  id           varchar2(64),
  name         varchar2(64),
  price        number,
  created_date date
)
;
-- Add comments to the table 
comment on table Table1
  is 'Table1';
-- Add comments to the columns 
comment on column Table1.id
  is 'UUID';
comment on column Table1.name
  is 'name';
comment on column Table1.price
  is 'price';
comment on column Table1.created_date
  is 'created time';