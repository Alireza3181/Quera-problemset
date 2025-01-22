def find_permutation(n, a):
    indexed_a = sorted((val, idx) for idx, val in enumerate(a))
    
    base_sum = indexed_a[0][0] + indexed_a[-1][0]
    
    for i in range(n // 2):
        if indexed_a[i][0] + indexed_a[n - i - 1][0] != base_sum:
            return -1
    
    perm = [0] * n
    for i in range(n):
        perm[indexed_a[i][1]] = indexed_a[n - i - 1][1] + 1
    
    return perm

n = int(input())
a = list(map(int, input().split()))

result = find_permutation(n, a)
if result == -1:
    print(-1)
else:
    print(' '.join(map(str, result)))
