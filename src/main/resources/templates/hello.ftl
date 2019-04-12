<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <style>
        body {
            background: #FFF;
        }

        button {
            clear: both;
            display: block;
            margin: 20px auto;
            outline: none;
            border-radius: 30px;
            border: 1px solid #eee;
            background: #FFF;
            padding: 10px 40px;
            color: #555;
        }

        .des {
            font-size: 12px;
            color: #aaa;
            width: 600px;
            margin: auto;
        }

        td {
            border-top: 1px dashed #eee;
            border-left: 1px dashed #eee;
            padding: 3px 25px;
            color: #555;
            font-size: 12px;
        }

        td:last-child {
            border-right: 1px dashed #eee;
        }

        table {
            border-bottom: 1px dashed #eee;
            margin-top: 20px;
            width: 600px;
            margin: auto;
        }

        .statement {
            color: red;
        }
    </style>
    <script src="https://cdn.bootcss.com/jquery/3.3.1/jquery.min.js"></script>
    <#--<script src="main.js"></script>-->
</head>
<body>
<div class="des">
    <h1>
        姓名、身份证号、银行卡号生成器
    </h1>
</div>
    <div class="des">
        <table>
            <tr>
                <td>
                    姓名规则：
                </td>
                <td>
                    百家姓
                </td>
            </tr>
            <tr>
                <td>
                    身份证号规则：
                </td>
                <td>
                    1978~1988年01~12月01~28日，随机34个省级行政区域
                </td>
            </tr>
            <tr>
                <td>
                    银行卡号规则：
                </td>
                <td>
                    随机五大银行
                </td>
            </tr>
            <tr>
                <td>
                    条数规则：
                </td>
                <td>
                    20条
                </td>
            </tr>
        </table>
        <button onclick='location.reload() '>
            换一批
        </button>
    </div>
    <div id="list">
    </div>
    <div class="des">
        <button onclick='location.reload() '>
            换一批
        </button>
    </div>
</body>
<script>
    // 随机数
    function random(max, min) {
        return Math.floor(Math.random() * (max - min + 1) + min);
    }

    // 随机姓名
    function name() {
        // 随机姓氏
        var familyNames = ["","李","赵","钱","孙","周","吴","郑","王","杨","苏"];
        var familyName = familyNames[random(0, familyNames.length - 1)];

        // 随机名字
        var word='\\u' + (Math.round(Math.random() * 20901) + 19968).toString(16);
        var givenNames = ["","有道","强","刚","丽","杰","军"];
        var givenName = givenNames[random(0, givenNames.length - 1)];

        return familyName + givenName;
    }

    // 随机身份证号码
    function idCard() {
        // 随机区划代码，全国各省、自治区、直辖市的行政区划代码表（GB/T 2260-2007）
        var provinceArray = ["110000", "120000", "130000", "140000", "150000", "210000", "220000", "230000", "310000", "320000", "330000", "340000", "350000", "360000", "370000", "410000", "420000", "430000", "440000", "450000", "460000", "500000", "510000", "520000", "530000", "540000", "610000", "620000", "630000", "640000", "650000", "710000", "810000", "820000"];
        var address = provinceArray[random(0, provinceArray.length - 1)];

        // 随机年月日
        var monthArray = ["01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"];
        var dayArray = ["01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28"];
        var birthday = random(1978, 1988) + monthArray[random(0, monthArray.length - 1)] + dayArray[random(0, dayArray.length - 1)];

        // 加权因子
        var coefficientArray = ["7", "9", "10", "5", "8", "4", "2", "1", "6", "3", "7", "9", "10", "5", "8", "4", "2"];
        // 校验码
        var lastNumberArray = ["1", "0", "X", "9", "8", "7", "6", "5", "4", "3", "2"];

        var s = Math.floor(Math.random() * 10).toString() + Math.floor(Math.random() * 10).toString() + Math.floor(Math.random() * 10).toString();
        var array = (address + birthday + s).split("");
        var total = 0;
        for (var i = 0; i < array.length; i++) {
            total = total + parseInt(array[i]) * parseInt(coefficientArray[i]);
        }
        var lastNumber = lastNumberArray[parseInt(total % 11)];

        return address + birthday + s + lastNumber;
    }

    // 随机银行卡号
    function bankCard() {
        // 随机行别代码
        var levelArray = ["102", "103", "104", "105", "301"];
        var number = "";
        switch (levelArray[random(0, levelArray.length - 1)]) {
            case "102":
                number = "622202";
                break;
            case "103":
                number = "622848";
                break;
            case "104":
                number = "621661";
                break;
            case "105":
                number = "622700";
                break;
            case "301":
                number = "622262";
                break;
            default:
        }

        for (var j = 0; j < 13; j++) {
            number = number + Math.floor(Math.random() * 10);
        }

        return number;
    }

    function phone() {
        // 随机姓氏
        var familyNames = ["133","135","138","151","158","185","183","159","177"];
        var familyName = familyNames[random(0, familyNames.length - 1)];
        for (var j = 0; j < 8; j++) {
            familyName = familyName + Math.floor(Math.random() * 10);
        }
        return familyName;
    }

    // 生成
    function genrate() {
        $("#list").empty();
        var trs = '<tr><td>序号</td><td>姓名</td><td>身份证号码</td><td>银行卡号码</td><td>手机号码</td></tr>';

        for (var i = 1; i <= 20; i++) {
            trs += '<tr><td>' + i + '</td><td>' + name() + '</td><td>' + idCard() + '</td><td>' + bankCard() + '</td><td>' + phone() + '</td></tr>';
        }
        var html = "<table style='width: 50%;'>" + trs + "</table>";
        $("#list").append(html);
    }
    genrate();
</script>
</html>