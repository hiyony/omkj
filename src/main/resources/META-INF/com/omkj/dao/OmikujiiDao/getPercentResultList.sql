SELECT DISTINCT f.unseicode AS fortunecode, f.unseiname AS fortunename, COUNT(f.unseiname) AS fortunecount, ROUND((100 * COUNT(f.unseiname) / SUM(COUNT(f.unseiname)) OVER()::numeric)) AS totalpercent
  FROM omikujii AS o
  LEFT OUTER JOIN fortunemaster AS f ON o.unseicode = f.unseicode
  LEFT OUTER JOIN unseiresult AS u ON o.omikujicode = u.omikujicode
 WHERE birthday = /*birthday*/'19971005'
 GROUP BY birthday, f.unseiname, f.unseicode
 ORDER BY f.unseicode ASC;