
import cv2 
import sys
import time

path ='./data/scuba.mp4'

cap = cv2.VideoCapture(path)
if cap.isOpened():
    while True:
        ret, img = cap.read()
        if ret:
            cv2.imshow(path, img)
            cv2.waitKey(25)  #25프레임 
        else:
            break
else:
    print()
cap.release()            

key = cv2.waitKey(0)
if key==ord('q') or key == 27 :
    cv2.destroyAllWindows()
    print('프로그램을 종료합니다')
    sys.exit()

