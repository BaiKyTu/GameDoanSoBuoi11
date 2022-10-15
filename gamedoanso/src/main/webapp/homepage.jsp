<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Game Đoán Số</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <div class="row" style="margin-left: 30%">
        <div class="col-6 text-center">
            <h1>Game Đoán Số</h1>
        </div>
    </div>
    <div class="row" style="margin-left: 30%">
        <div class="col-6 text-center">
            <form action="http://localhost:8080/gamedoanso/home-page" method="post">
                <div class="form-group">
                    <label for="number">Mời nhập số</label>
                    <input type="text" class="form-control" id="number" name="number">
                </div>
                <input type="submit" class="btn btn-primary">
            </form>
        </div>
    </div>
    <hr>
    <div class="row">
        <h2 style="margin-left: 25%">${message}</h2>
    </div>
    <br><hr>
    <a class="btn btn-primary ml-5" href="https://www.w3schools.com">View Record</a>
</div>
<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>
</body>
</html>
