<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<title></title>
		<link rel="stylesheet" href="css/index.css" />   
		<link rel="stylesheet" href="css/AfterIndex.css" />
		<link rel="stylesheet" href="css/xiala.css" />
		 <script type="text/javascript" src="js/_ll.js" ></script>
		 <script type="text/javascript" src="js/_iframe.js" ></script>
	</head>
	<body>
		
		<div id="top">
			<ul>
				<li><a href="AfterIndex.jsp">首页</a></li>
				<li id="denglu"><a href="index.jsp">注销</a></li>
				<li><a href="#">管理我的消息</a></li>
				<li><a href="gouwuche.jsp">购物车</a></li>
				<li><a href="#">联系我们</a></li>
			</ul>
		</div>
		<div id="ssl">
			<div class="spzs">商品展示</div>
			<div class="button"><input type="text" placeholder="充电宝"/><button>搜索</button></div>
			<div><a href="gouwuche.jsp">我的购物车</a></div>
		</div>
		
	    
	    <div id="qpsp">
	    	<p class="_p">全部商品分类</p>
	    	
			
	    </div>
	    
	    
	    <div id="shang_left">
	    	
	    	
	    
	    	<div id="lb_01">
		    <img id="_img" onclick="_ll()" src="img/chu.png" width="30px" height="30px"/><p><a href="#">电脑/笔记本</a></p>
		    </div>
		    
	    	<div id="shop_class" >
	    	<ul>
	    		<li onclick="_iframe()"><a href="#">神州计算机</a></li>
	    		<li><a href="#">华硕计算机</a></li>
	    		<li><a href="#">联想计算机</a></li>
	    		<li><a href="#">惠普计算机</a></li>
	    		<li><a href="#">红旗计算机</a></li>
	    		<li><a href="#">苹果计算机</a></li>
	    	</ul>
	    	</div>
	    	
	    	
	    	
	    	
	    	<div id="lb_01">
		    <img id="_img2" onclick="_ll2()" src="img/chu.png" width="30px" height="30px"/><p><a href="#">水果/蔬菜</a></p>
		    </div>
		    
	    	<div id="shop_class2" >
	    	<ul>
	    		<li><a href="#">苹果</a></li>
	    		<li><a href="#">白菜</a></li>
	    		<li><a href="#">黄瓜</a></li>
	    		<li><a href="#">青菜</a></li>
	    		<li><a href="#">香蕉</a></li>
	    		<li><a href="#">梨</a></li>
	    	</ul>
	    	</div>
	    	
	    </div>
	    <div id="geirenxx">
	    	<p><a href="xiugaimima.jsp">修改密码</a></p>
	    	<p><a href="xgNickname.jsp">修改个人消息</a></p>
	    </div>
	    
	    
	    
	    
	    
	    
	    

	
		
		
		
		
		
		
		
		
		
		<div id="_iframe">
			<iframe id="_iframe_nr" src="new_shangping.jsp"></iframe>
		</div>
		
	</body>
</html>
