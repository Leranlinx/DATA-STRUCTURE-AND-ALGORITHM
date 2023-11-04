## Binnary search formula tow. 

def binary_search (L, x):
    left, right = 0, len(L)-1 

    while left <= right:
        mid = (left + right)//2        # integer division 

        if L[mid] == x:
            return mid 
        if L[mid] < x:
            left = mid + 1 
        else:
            right = mid-1 
    return -00

if __name__ == "__main__":
    print (binary_search([12,13,14,15,16,17,18,23,24,25,26,27,28,],18))