<!DOCTYPE html>
<html>
<head>
  <title>Project Eight</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
  <link href="styles.css" rel="stylesheet">
</head>
<body>
<h1>Scegli la tua destinazione</h1>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
<form action="MyServlet" method="post">
  <label for="destinazione">Scegli la tua destinazione:</label>
  <select id="destinazione" name="destinazione">
    <option value="Roma">Roma</option>
    <option value="Parigi">Parigi</option>
    <option value="Atene">Atene</option>
    <option value="Bruxelles">Bruxelles</option>
    <option value="Budapest">Budapest</option>
    <option value="Copenaghen">Copenaghen</option>
    <option value="Lisbona">Lisbona</option>
  </select>
  <br>
  <input type="submit" value="Ottieni Informazioni">
</form>
</body>
</html>
