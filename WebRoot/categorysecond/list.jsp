<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<HTML>
	<head>
		<meta http-equiv="Content-Language" content="zh-cn">
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link href="${pageContext.request.contextPath}/css/Style1.css" rel="stylesheet" type="text/css" />
		<link href="${pageContext.request.contextPath}/css/common.css" rel="stylesheet" type="text/css"/>
		<script language="javascript" src="${pageContext.request.contextPath}/js/public.js"></script>
		<script type="text/javascript">
		   //跳转到添加二级分类页面
		   function addCategorySecond(){
				window.location.href = "${pageContext.request.contextPath}/categorysecond_addUI.action";
			}
          //传递当前页和cid
          function gotopage(page){
    	       window.location.href="${pageContext.request.contextPath}/adminCategorySecond_findAllByPage?page="+page+"";
          }
		</script>
	</head>
	<body>
		<br>
		<form id="Form1" name="Form1" action="${pageContext.request.contextPath}/user/list.jsp" method="post">
			<table cellSpacing="1" cellPadding="0" width="100%" align="center" bgColor="#f5fafe" border="0">
				<TBODY>
					<tr>
						<td class="ta_01" align="center" bgColor="#afd1f3">
							<strong>二级分类 列 表</strong>
						</td>
					</tr>
					<tr>
						<td class="ta_01" align="right">
							<button type="button" id="add" name="add" value="添加" class="button_add" onclick="addCategorySecond()">
							   &#28155;&#21152;
                            </button>

						</td>
					</tr>
					<tr>
						<td class="ta_01" align="center" bgColor="#f5fafe">
							<table cellspacing="0" cellpadding="1" rules="all"
								bordercolor="gray" border="1" id="DataGrid1"
								style="BORDER-RIGHT: gray 1px solid; BORDER-TOP: gray 1px solid; BORDER-LEFT: gray 1px solid; WIDTH: 100%; WORD-BREAK: break-all; BORDER-BOTTOM: gray 1px solid; BORDER-COLLAPSE: collapse; BACKGROUND-COLOR: #f5fafe; WORD-WRAP: break-word">
								<tr style="FONT-WEIGHT: bold; FONT-SIZE: 12pt; HEIGHT: 25px; BACKGROUND-COLOR: #afd1f3">

									<td align="center" width="18%">
										序号
									</td>
									<td align="center" width="17%">
										二级分类名称
									</td>
									<td width="7%" align="center">
										编辑
									</td>
									<td width="7%" align="center">
										删除
									</td>
								</tr>
								<s:iterator var="cs" value="list" status="status">
										<tr onmouseover="this.style.backgroundColor = 'white'"
											onmouseout="this.style.backgroundColor = '#F5FAFE';">
											<td style="CURSOR: hand; HEIGHT: 22px" align="center"
												width="18%">
												<s:property value="#status.count"/>
											</td>
											<td style="CURSOR: hand; HEIGHT: 22px" align="center"
												width="17%">
												<s:property value="#cs.csname"/>
											</td>
											<td align="center" style="HEIGHT: 22px"><!--  -->
												<a href="${pageContext.request.contextPath}/categorysecond_editUI.action?csid=<s:property value="#cs.csid"/>">
													<img src="${pageContext.request.contextPath}/images/i_edit.gif" border="0" style="CURSOR: hand">
												</a>
											</td>
									
											<td align="center" style="HEIGHT: 22px">
												<a href="${pageContext.request.contextPath}/categorysecond_delete.action?csid=<s:property value="#cs.csid"/>">
													<img src="${pageContext.request.contextPath}/images/i_del.gif" width="16" height="16" border="0" style="CURSOR: hand">
												</a>
											</td>
										</tr>
									</s:iterator>	
							</table>
						</td>
					</tr>
				</TBODY>
			</table>
		<%--========================显示分页=================================== --%>
		<div class="pagination">
		  <span style="color:#666;">第${page}页/共${pageCount}页</span>
			    <s:if test="page != 1">
			        <%--跳转到首页 --%>
					<a href="javascript:gotopage(1)" class="firstPage">&nbsp;</a>
					
					<%--上一页 --%>
					<a href="javascript:gotopage(${page}-1)" class="previousPage">&nbsp;</a>
			   </s:if>	  
			  <s:iterator var="num" begin="%{beginIndex}" end="%{endIndex}">
				<s:if test="#num == page">
				   <span class="currentPage">${num}</span>
				</s:if>
				<s:else>
				   <a href="javascript:gotopage(${num})">${num}</a>
				</s:else>
			  </s:iterator>
			    <s:if test="page != pageCount">
				<%--下一页 --%>
				<a href="javascript:gotopage(${page}+1)" class="nextPage">&nbsp;</a>
				
				<%--跳转到尾页 --%>  
				<a href="javascript:gotopage(${pageCount})"class="lastPage">&nbsp;</a>
			   </s:if>
		</div>		
		</form>
		
	</body>
</HTML>

