<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
		<link rel="stylesheet" href="css/OrderPage.css" />
	</head>
<script type="text/javascript">
	var arr_province = ["请选择省/城市", "北京市", "上海市", "天津市", "重庆市", "深圳市", "广东省"];
	var arr_city = [
		["请选择城市/地区"],
		["东城区", "西城区", "朝阳区", "宣武区", "昌平区", "大兴区", "丰台区", "海淀区"],
		['宝山区', '长宁区', '丰贤区', '虹口区', '黄浦区', '青浦区', '南汇区', '徐汇区', '卢湾区'],
		['和平区', '河西区', '南开区', '河北区', '河东区', '红桥区', '塘古区', '开发区'],
		['俞中区', '南岸区', '江北区', '沙坪坝区', '九龙坡区', '渝北区', '大渡口区', '北碚区'],
		['福田区', '罗湖区', '盐田区', '宝安区', '龙岗区', '南山区', '深圳周边'],
		['广州市', '惠州市', '汕头市', '珠海市', '佛山市', '中山市', '东莞市']
	];
	//网页加载完成，初始化菜单
	window.onload = init; //传入函数地址
	function init() {
		//首先获取对象
		var province = document.form1.province;
		var city = document.form1.city;

		//指定省份中<option>标记的个数
		province.length = arr_province.length;

		//循环将数组中的数据写入<option>标记中
		for(var i = 0; i < arr_province.length; i++) {
			province.options[i].text = arr_province[i];
			province.options[i].value = arr_province[i];
		}

		//修改省份列表的默认选择项
		var index = 0;
		province.selectedIndex = index;

		//指定城市中<option>标记的个数
		city.length = arr_city[index].length;

		//循环将数组中的数据写入<option>标记中
		for(var j = 0; j < arr_city[index].length; j++) {
			city.options[j].text = arr_city[index][j];
			city.options[j].value = arr_city[index][j];
		}

	}

	function changeSelect(index) {
		//选择对象
		var city = document.form1.city;
		//修改省份列表的选择项
		province.selectedIndex = index;

		//指定城市中<option>标记的个数
		city.length = arr_city[index].length;

		//循环将数组中的数据写入<option>标记中
		for(var j = 0; j < arr_city[index].length; j++) {
			city.options[j].text = arr_city[index][j];
			city.options[j].value = arr_city[index][j];
		}
	}
</script>
	<body>
		
		<div id="head_p"><p>收货的新增地址</p></div>
		<form name="form1" method="post" action="">
		<div id="Addr">
			<div class="addr01">
				<span>收货人</span>
				<input type="text" placeholder="李四"/>
			</div >
			<div  class="addr02">
				<span>收货地址</span>
			省份：
			<select name="province" id="province" onchange="changeSelect(this.selectedIndex)"></select>
			地区：
			<select name="city" id="city"></select>
			区/县 :
			<select> 
			     <option>1</option>
			</select>
			</div>
			
	
			
			<div class="addr04">
				<span>联系电话</span>
				<input type="text" placeholder="13212201197" />
				
			</div>
			
			<div class="addr03">
				<span>收货时间</span>
				<select><option>收货时间不限</option></select>
			</div>
			
			<div class="addr05">
				<span>详细地址</span>
				<textarea></textarea>
			</div>
			
			
			<div class="addr06">
				<button>保存</button>
				
			</div>
		
			
			
		</div>
		
		</form>
		
	</body>
</html>
