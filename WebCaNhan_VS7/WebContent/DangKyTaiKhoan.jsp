<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Đăng ký</title>
    <link href="https://fonts.googleapis.com/css?family=Coiny" rel="stylesheet">
    <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="css/style.css">
    <script src="javascript/jquery-3.1.1.min.js"></script>
    <script src="bootstrap/js/bootstrap.min.js"></script>
    <script src="javascript/myjs.js"></script>

</head>
<body>
    <jsp:include page="header.jsp"></jsp:include>	

    <div class="container">
        <div class="row">
            <div class="col-lg-7 col-md-7 col-sm-10 col-xs-12" style="padding: 0px 35px">
                <h1><strong>Bạn chỉ cần có một tài khoản</strong></h1>
                <p style="text-align: justify;">Một tài khoản sẽ giúp bạn truy cập vào khóa học của mình!</p>
                <img src="image/1.jpg" alt="" width="100%" height="auto">
            </div>

            <div class="col-lg-5 col-md-5 col-sm-10 col-xs-12">
                <h2>ĐĂNG KÝ TÀI KHOẢN</h2>
                <form>
                    <div class="form-group">
                        <label for="username">Tên Đăng Nhập</label>
                        <input id="username" type="text" class="form-control" placeholder="Tên đăng nhập">
                    </div>
                    <div class="form-group">
                        <label class="control-label" for="pass">Nhập Mật khẩu</label>
                        <input name="pass" type="text" class="form-control" placeholder="Tên đăng nhập">
                    </div>
                    <div class="form-group">
                        <label class="control-label" for="name">Họ Tên Đầy Đủ</label>
                        <input name="name" type="text" class="form-control" placeholder="Họ tên đầy đủ">
                    </div>
                    <div class="form-group">
                        <div class="row">
                            <div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">
                                <label class="control-label" for="name">Ngày</label>
                                <input name="Ngay" type="text" class="form-control" placeholder="Ngày">
                            </div>
                            <div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">
                                <label class="control-label" for="name">Tháng</label><span class="select2-chosen"></span>
                                <abbr class="select2-search-choice-close"></abbr>
                                <span class="select2-arrow"><b></b></span>
                                <select id="searchvol" class="newselect-sm elect2-offscreen form-control" tabindex="-1">
                                    <option>Tháng 1</option>
                                    <option>Tháng 2</option>
                                    <option>Tháng 3</option>
                                    <option>Tháng 4</option>
                                    <option>Tháng 5</option>
                                    <option>Tháng 6</option>
                                    <option>Tháng 7</option>
                                    <option>Tháng 8</option>
                                    <option>Tháng 9</option>
                                    <option>Tháng 10</option>
                                    <option>Tháng 11</option>
                                    <option>Tháng 12</option>
                                </select>
                            </div>
                            <div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">
                                <label class="control-label" for="name">Năm</label>
                                <input name="Nam" type="text" class="form-control" placeholder="Năm">
                            </div>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label" for="DiaChi">Chỗ nay</label>
                        <input name="DiaChi" type="text" class="form-control" placeholder="Chỗ ở hiện nay">
                    </div>
                    <div class="form-group">
                        <label class="control-label" for="name">Quê Quán</label>
                        <input name="quequan" type="text" class="form-control" placeholder="Quê quán">
                    </div>
                    <div class="form-group has-feedback">
                        <label class="control-label" for="name">Số điện thoại</label>
                        <input name="SDT" type="text" class="form-control" placeholder="Số điện thoại">
                    </div>
                    <div class="form-group has-feedback">
                        <label class="control-label" for="name">Email liên hệ</label>
                        <input name="Email" type="text" class="form-control" placeholder="Email">
                    </div>
                </form>
                <a href="">
                    <button class="btn btn-primary pull-right" ng-disabled="!form.$dirty || (form.$dirty && form.$invalid)">Đăng Ký</button>
                </a>
            </div>
        </div>
    </div> <!-- Noi dung -->
    <jsp:include page="footer.jsp"></jsp:include>
</body>
</html>