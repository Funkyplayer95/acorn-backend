import time
import FinanceDataReader as fdr
# 에러 pip install FinanceDataReader 
# 정답 pip install finance-datareader

df_krx = fdr.StockListing('KRX')
df_kospi = fdr.StockListing('KOSPI')

# print(type(df_krx))  <class 'pandas.core.frame.DataFrame'>
# print(type(df_kospi)) <class 'pandas.core.frame.DataFrame'>
print(df_krx.head())
print(df_kospi.head())
print(df_krx.head())
print('krx 거래업체수 ' , df_krx['Code'].count())
print('kospi거래업체수 ' , df_kospi['Code'].count())
print()

search_name ='삼성전자'
result = df_krx[ df_krx['Name'] == search_name ]
print(search_name, '회사 주식정보')
print(result)
print()

# 삼성전자 주식거래 005930
df = fdr.DataReader('005930', '2023-12-01','2023-12-06')
print(df)
print()

# 복사후 df2명명
df2 = fdr.DataReader('005930')
print(df2)



time.sleep(1)





time.sleep(1)
print()
print()