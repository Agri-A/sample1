 public class note{
	public static void main(String args[])
	{
		pen.write();
}
}

protoc object_detection/protoc/*.protoc --python_out=.

cp object_detection/packages/tf2/setup.py .

python -m pip install .

pip uninstall object-detection

import tensorflow as tf print(tf.__version__)

cd tensorflow/models/research/object_detection
cat setup.py | grep version 