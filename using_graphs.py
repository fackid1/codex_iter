import matplotlib.pyplot as plt

import numpy as np

cnums = np.arange(5) + 1j * np.arange(6,11)

X = [x.real for x in cnums]

Y = [x.imag for x in cnums]

plt.scatter(X,Y, color='red')

plt.show()
