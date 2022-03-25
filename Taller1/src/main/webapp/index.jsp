<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
  </head>
  <body>
    <form class="form" method="post" action="success">
      <label for="department">Department</label>
      <select name="depto">
        <option value="Sonsonate">Sonsonate</option>
        <option value="San Salvador">San Salvador</option>
        <option value="La Libertad">La Libertad</option>
        <option value="San Miguel">San Miguel</option>
        <option value="La Unión">La Unión</option>
        <option value="San Vicente">San Vicente</option>
        <option value="La Paz">La Paz</option>
        <option value="Ahuachapan">Ahuachapan</option>
        <option value="Morazán">Morazán</option>
        <option value="Chalatenango">Chalatenango</option>
        <option value="Santa Ana">Santa Ana</option>
        <option value="Cuscatlan">Cuscatlan</option>
        <option value="Usulután">Usulután</option>
        <option value="Cabañas">Cabañas</option>
      </select>
      <p>${deptoError}</p>
      <label for="name">Name</label>
      <input id="name" name="name" type="text" />
      <p>${nameError}</p>
      <label for="lastname">Last Name</label>
      <input id="lastname" name="lastname" type="text" />
      <p>${lastnameError}</p>
      <label for="ucaid">ID UCA</label>
      <input id="ucaid" name="idUca" type="text" />
      <p>${idUcaError}</p>
      <label for="birthday">Birth Day</label>
      <input id="birthday" name="dob" type="text" />
      <p>${dobError}</p>
      <input type="submit" />
    </form>
  </body>
</html>
