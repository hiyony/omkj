SELECT f.unseiname AS unseiname, o.negaigoto AS negaigoto, o.akinai AS akinai, o.gakumon AS gakumon 
FROM omikujii AS o 
JOIN fortunemaster AS f 
ON f.unseicode = o.unseicode 
WHERE o.omikujicode = /* omikujiID */;