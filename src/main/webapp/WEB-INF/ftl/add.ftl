<html>
 <head> 
  <title>Registration Page</title> 
 </head> 
 <body> 
  <form method="POST" action="/FirstMvcWebApp/add"> 
   <table> 
    <tbody>
     <tr> 
      <td>User Name : </td> 
      <td><input type="text" name="name" /></td> 
     </tr> 
     <tr>
      <td>enable :</td> 
      <td> <input type="checkbox" name="enable" /><br /> </td> 
     </tr> 
     <tr> 
      <td>address :</td> 
      <td><input type="text" name="address" /></td> 
     </tr> 
     <tr> 
      <td>telphone :</td> 
      <td><input type="text" name="tel" /></td> 
     </tr> 
     <tr> 
      <td>age :</td> 
      <td><input type="number" name="age" value="20" /></td> 
     </tr> 
     <tr> 
      <td colspan="2" style="text-align: center;"> <input type="submit" value="submit" name="regist" /> </td> 
     </tr> 
    </tbody>
   </table> 
  </form>  
 </body>
</html>