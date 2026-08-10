SELECT name
FROM SalesPerson s
WHERE NOT EXISTS (
    select *
    from Orders o join Company c
    on o.com_id=c.com_id
    where o.sales_id=s.sales_id and c.name='RED'
);