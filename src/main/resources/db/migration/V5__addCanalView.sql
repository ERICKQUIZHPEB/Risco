CREATE TABLE IF NOT EXISTS canal_view AS

SELECT c.*, z.fullname zona
FROM canal c JOIN  zona z ON c.zona_id = z.id
