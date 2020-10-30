from flask import Flask,render_template,request,redirect,url_for
from werkzeug.utils import secure_filename
from urllib.parse import unquote, quote
import os



app = Flask(__name__)
ALLOWED_EXTENSIONS = set(['txt', 'pdf', 'png', 'jpg', 'jpeg', 'gif'])

@app.route('/upload', methods=['POST', 'GET'])
def upload():
    if request.method == 'POST':
        f = request.files['image']
        basepath = os.path.dirname(__file__)  # 当前文件所在路径
        upload_path = os.path.join(basepath, 'var\\uploads',f.filename)  #注意：没有的文件夹一定要先创建，不然会提示没有该路径
        f.save(upload_path)
        return render_template('success__upload.html')
    else:
        return render_template('upload.html')

if __name__ =='__main__':
    app.run ()