CREATE TABLE IF NOT EXISTS gate_view AS

SELECT g.*, c.description canal
FROM gate g JOIN  canal c ON g.canal_id = c.id
