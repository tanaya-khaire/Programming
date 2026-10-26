function CheckEven(No)
{
    return (No % 2 == 0)
}

function main()
{
    let Value = 11
    let bret = false

    bret = CheckEven(Value)

    if(bret)
    {
        console.log(`${Value} is even number`);
    }
    else
    {
        console.log(`${Value} is odd number`);
    }
}

main()