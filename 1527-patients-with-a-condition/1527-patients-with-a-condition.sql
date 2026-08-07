SELECT  patient_id , patient_name , conditions  
FROM Patients 
WHERE conditions Like('DIAB1%') or conditions Like('% DIAB1%')