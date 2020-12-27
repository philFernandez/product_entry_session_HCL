<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Product Entry</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <h1>Product Entry</h1>
    <form action="productEntry" method="post">
        <table>
            <tr>
                <td>Product Name</td>
                <td><input type="text" name="name"></td>
            </tr>
            <tr>
                <td>Product Price</td>
                <td><input type="text" name="price"></td>
            </tr>
            <tr>
                <td>Product Quantity</td>
                <td><input type="text" name="quantity"></td>
            </tr>
        </table>
        <br><br>
        <button type="submit">Submit</button>
    </form>
    <br><br>
    <a href="showNewProduct.jsp"><button>Product List</button></a>
</body>
</html>

