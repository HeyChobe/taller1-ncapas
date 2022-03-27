<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8" />
  <meta http-equiv="X-UA-Compatible" content="IE=edge" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <link rel="stylesheet" href="./assets/style.css">
  <title>Document</title>
</head>

<body>
  <form class="form" method="post" action="success">
    <select name="depto">
      <option id='select-placeholder' disabled hidden selected>Department</option>
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
    <p id="error" >${deptoError}</p>
    <input id="name" name="name" type="text" placeholder="Name" />
    <p id="error" >${nameError}</p>
    <input id="lastname" name="lastname" type="text" placeholder="Last name" />
    <p id="error" >${lastnameError}</p>
    <input id="ucaid" name="idUca" type="text" placeholder="ID UCA" />
    <p id="error" >${idUcaError}</p>
    <input id="birthday" name="dob" type="text" placeholder="Birth Day" />
    <p id="error" >${dobError}</p>
    <button type="submit">Save</button>
  </form>

</body>

</html>
