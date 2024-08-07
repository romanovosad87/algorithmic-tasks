-- https://www.codewars.com/kata/5816a3ecf54413a113000074/train/sql
-- ChatGPT support
SELECT
    EXTRACT(MONTH FROM payment_date) AS month,
    COUNT(*) AS total_count,
    SUM(amount) AS total_amount,
    COUNT(CASE WHEN staff_id = 1 THEN 1 END) AS mike_count,
    SUM(CASE WHEN staff_id = 1 THEN amount END) AS mike_amount,
    COUNT(CASE WHEN staff_id = 2 THEN 1 END) AS jon_count,
    SUM(CASE WHEN staff_id = 2 THEN amount END) AS jon_amount
FROM
    payment
GROUP BY
    EXTRACT(MONTH FROM payment_date)
ORDER BY
    EXTRACT(MONTH FROM payment_date);