<html>
<head>
    <title>upload Page</title>
</head>
<body>
<form method="POST" action="/FirstMvcWebApp/addfile" enctype="multipart/form-data">
    <table>
        <tbody>
        <tr>
            <td>pngfile : </td>
            <td><input type="file" name="file" accept="image/png" /></td>
        </tr>
        <tr>
            <td colspan="2" style="text-align: center;"> <input type="submit" value="submit" /> </td>
        </tr>
        </tbody>
    </table>
</form>
</body>
</html>