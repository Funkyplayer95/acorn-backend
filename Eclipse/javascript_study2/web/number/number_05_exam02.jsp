<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>반복문</title>
		<script type="text/javascript">
		// 공백체크하는 함수
		function checkNull(param_sv) {
			var ret;
			if( (param_sv == "") || (param_sv == null) ) {
				ret = false;
			} else {
				ret = true;
			}
			return ret;
		}
		
		//문자열 확인 및 변환함수
		function radixConvert(param_first, param_secon){
			var ret_converted;
			if(typeof(param_first) == "string") {
				var num_cv = new Number(param_first);
				var ret = confirm(param_secon + '진수로 변환하시겠습니까?');
				if(ret == true) {
					if(param_secon == "2") {
						ret_converted = num_cv.toString(2);
					} else if(param_secon == "16") {
						ret_converted = num_cv.toString(16);
					} else {
						alert("지원하지 않는 진수를 선택하셨습니다.");
						return;
					}
				} else {
					alert('변환을 거부하셨습니다.');
					return;
				}
			}
			return ret_converted;
		}
			
		//변환출력함수
		function printResult(printval) {
			document.getElementById('convertedVal').value = printval;	
		}
		
		//전체 메인
		function main() {
			// 입력처리 부분: 입력값을 변수에 저장
			var sv = document.getElementsByName('sourceVal')[0].value;
			var radix = document.getElementById('selected');
			var radixTxt = radix.options[radix.selectedIndex].value;
			
			var chkFlag = checkNull(sv);
		
			if(chkFlag == true) {
				var ret = radixConvert(sv, radixTxt);
				printResult(ret);
			} else {
				alert('값이 없습니다. 입력 필수');
				return;
			}
		
		
		}
		</script>
	</head>
	<body>
		<table>
			<tr><td><label>10진수</label></td>
				<td><input type="text" name="sourceVal" id="sourceVal" /></td></tr>
			<tr><td>
			<select name="language" id="selected">
			<option value="2">2진수</option>
			<option value="16">16진수</option></select>
			</td>
			<td><input type="text" name="convertedVal" id="convertedVal" /></td></tr>	
			<tr><td colspan="2"><input type="button" value="변환" onclick="main()" /></td></tr>
		</table>
	</body>
</html>