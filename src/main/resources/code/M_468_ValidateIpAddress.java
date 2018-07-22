/**
 * [468] Validate IP Address
 * 
 * difficulty: Medium
 * 
 * TestCase Example: "172.16.254.1"
 * 
 * https://leetcode-cn.com/problems/validate-ip-address/
 * 
 * 
 * 
 * Write a function to check whether an input string is a valid IPv4 address or IPv6 address or neither.
 * 
 * 
 * 
 * IPv4 addresses are canonically represented in dot-decimal notation, which consists of four decimal numbers, each ranging from 0 to 255, separated by dots ("."), e.g.,172.16.254.1;
 * 
 * 
 * 
 * Besides, leading zeros in the IPv4 is invalid. For example, the address 172.16.254.01 is invalid.
 * 
 * 
 * 
 * IPv6 addresses are represented as eight groups of four hexadecimal digits, each group representing 16 bits. The groups are separated by colons (":"). For example, the address 2001:0db8:85a3:0000:0000:8a2e:0370:7334 is a valid one. Also, we could omit some leading zeros among four hexadecimal digits and some low-case characters in the address to upper-case ones, so 2001:db8:85a3:0:0:8A2E:0370:7334 is also a valid IPv6 address(Omit leading zeros and using upper cases).
 * 
 * 
 * 
 * 
 * However, we don't replace a consecutive group of zero value with a single empty group using two consecutive colons (::) to pursue simplicity. For example, 2001:0db8:85a3::8A2E:0370:7334 is an invalid IPv6 address.
 * 
 * 
 * 
 * Besides, extra leading zeros in the IPv6 is also invalid. For example, the address 02001:0db8:85a3:0000:0000:8a2e:0370:7334 is invalid.
 * 
 * 
 * 
 * Note:
 * You may assume there is no extra space or special characters in the input string.
 * 
 * 
 * Example 1:
 * 
 * Input: "172.16.254.1"
 * 
 * Output: "IPv4"
 * 
 * Explanation: This is a valid IPv4 address, return "IPv4".
 * 
 * 
 * 
 * 
 * Example 2:
 * 
 * Input: "2001:0db8:85a3:0:0:8A2E:0370:7334"
 * 
 * Output: "IPv6"
 * 
 * Explanation: This is a valid IPv6 address, return "IPv6".
 * 
 * 
 * 
 * Example 3:
 * 
 * Input: "256.256.256.256"
 * 
 * Output: "Neither"
 * 
 * Explanation: This is neither a IPv4 address nor a IPv6 address.
 * 
 * 
 * 
 * 
 * >>>>>>中文描述<<<<<<
 * 
 * 
 * [468] 验证IP地址
 * 
 * 
 * 编写一个函数来验证输入的字符串是否是有效的 IPv4 或 IPv6 地址。
 * 
 * IPv4 地址由十进制数和点来表示，每个地址包含4个十进制数，其范围为 0 - 255， 用(".")分割。比如，172.16.254.1；
 * 
 * 同时，IPv4 地址内的数不会以 0 开头。比如，地址 172.16.254.01 是不合法的。
 * 
 * IPv6 地址由8组16进制的数字来表示，每组表示 16 比特。这些组数字通过 (":")分割。比如,  2001:0db8:85a3:0000:0000:8a2e:0370:7334 是一个有效的地址。而且，我们可以加入一些以 0 开头的数字，字母可以使用大写，也可以是小写。所以， 2001:db8:85a3:0:0:8A2E:0370:7334 也是一个有效的 IPv6 address地址 (即，忽略 0 开头，忽略大小写)。
 * 
 * 然而，我们不能因为某个组的值为 0，而使用一个空的组，以至于出现 (::) 的情况。 比如， 2001:0db8:85a3::8A2E:0370:7334 是无效的 IPv6 地址。
 * 
 * 同时，在 IPv6 地址中，多余的 0 也是不被允许的。比如， 02001:0db8:85a3:0000:0000:8a2e:0370:7334 是无效的。
 * 
 * 说明: 你可以认为给定的字符串里没有空格或者其他特殊字符。
 * 
 * 示例 1:
 * 
 * 输入: "172.16.254.1"
 * 
 * 输出: "IPv4"
 * 
 * 解释: 这是一个有效的 IPv4 地址, 所以返回 "IPv4"。
 * 
 * 
 * 示例 2:
 * 
 * 输入: "2001:0db8:85a3:0:0:8A2E:0370:7334"
 * 
 * 输出: "IPv6"
 * 
 * 解释: 这是一个有效的 IPv6 地址, 所以返回 "IPv6"。
 * 
 * 
 * 示例 3:
 * 
 * 输入: "256.256.256.256"
 * 
 * 输出: "Neither"
 * 
 * 解释: 这个地址既不是 IPv4 也不是 IPv6 地址。
 * 
 */
public class M_468_ValidateIpAddress {
    public String validIPAddress(String IP) {
        
    }
}