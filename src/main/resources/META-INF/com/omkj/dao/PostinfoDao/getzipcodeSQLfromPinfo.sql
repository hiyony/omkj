SELECT zipcode, homeaddress
FROM postinfo
WHERE homeaddress1=/* homeaddress */'千葉県'
AND homeaddress LIKE /* @infix(replaceaddress) */'%浦安市堀江%'